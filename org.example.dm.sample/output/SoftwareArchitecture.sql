CREATE SCHEMA IF NOT EXISTS software_architecture;

CREATE TABLE software_architecture.software (
  id UUID NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(1000),
  CONSTRAINT software_pk PRIMARY KEY (id)
);

CREATE TABLE software_architecture.subsystem (
  id UUID NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(1000),
  parent_id UUID NOT NULL,
  software_id UUID NOT NULL,
  CONSTRAINT subsystem_pk PRIMARY KEY (id),
  CONSTRAINT parent_fk FOREIGN KEY (parent_id) REFERENCES software_architecture.subsystem(id),
  CONSTRAINT software_fk FOREIGN KEY (software_id) REFERENCES software_architecture.software(id)
);

CREATE TABLE software_architecture.requirement (
  id UUID NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(1000),
  effort INTEGER,
  priority_id UUID NOT NULL,
  software_id UUID NOT NULL,
  CONSTRAINT requirement_pk PRIMARY KEY (id),
  CONSTRAINT priority_fk FOREIGN KEY (priority_id) REFERENCES software_architecture.priority(id),
  CONSTRAINT software_fk FOREIGN KEY (software_id) REFERENCES software_architecture.software(id),
  CONSTRAINT effort_check CHECK (effort >= 0)
);

CREATE TABLE software_architecture.business_requirement (
  id UUID NOT NULL,
  CONSTRAINT business_requirement_pk PRIMARY KEY (id),
  CONSTRAINT requirement_fk FOREIGN KEY (id) REFERENCES software_architecture.requirement(id)
);

CREATE TABLE software_architecture.system_requirement (
  id UUID NOT NULL,
  user_scenario TEXT,
  CONSTRAINT system_requirement_pk PRIMARY KEY (id),
  CONSTRAINT requirement_fk FOREIGN KEY (id) REFERENCES software_architecture.requirement(id)
);

CREATE TABLE software_architecture.priority (
  id UUID NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(1000),
  ordinal INTEGER NOT NULL,
  CONSTRAINT priority_pk PRIMARY KEY (id),
  CONSTRAINT ordinal_check CHECK (ordinal >= 0)
);

CREATE TABLE software_architecture.requirement_implementation (
  system_requirements_id UUID NOT NULL,
  business_requirements_id UUID NOT NULL,
  CONSTRAINT requirement_implementation_pk PRIMARY KEY (system_requirements_id, business_requirements_id),
  CONSTRAINT system_requirements_fk FOREIGN KEY (system_requirements_id) REFERENCES software_architecture.system_requirement(id),
  CONSTRAINT business_requirements_fk FOREIGN KEY (business_requirements_id) REFERENCES software_architecture.business_requirement(id)
);
