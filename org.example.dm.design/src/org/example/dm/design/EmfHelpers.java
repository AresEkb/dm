package org.example.dm.design;

import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;

public class EmfHelpers {

    private EmfHelpers() {
        // Don't instantiate the helper class
    }

    public static <T extends EObject> Optional<T> findContainer(EObject object, Class<T> containerClass) {
        return findContainerOrSelf(object.eContainer(), containerClass);
    }

    @SuppressWarnings("unchecked")
    public static <T extends EObject> Optional<T> findContainerOrSelf(EObject object, Class<T> cls) {
        if (object == null) {
            return Optional.empty();
        }
        if (cls.isInstance(object)) {
            return Optional.of((T) object);
        }
        return findContainerOrSelf(object.eContainer(), cls);
    }

    public static Optional<EObject> findContainerOrSelf(EObject object, Predicate<EObject> predicate) {
        if (object == null) {
            return Optional.empty();
        }
        if (predicate.test(object)) {
            return Optional.of(object);
        }
        return findContainerOrSelf(object.eContainer(), predicate);
    }

}
