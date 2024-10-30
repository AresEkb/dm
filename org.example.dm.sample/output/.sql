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
  software_id UUID NOT NULL,
  parent_id UUID NOT NULL,
  CONSTRAINT subsystem_pk PRIMARY KEY (id),
  CONSTRAINT software_fk FOREIGN KEY (software_id) REFERENCES software_architecture.software(id),
  CONSTRAINT parent_fk FOREIGN KEY (parent_id) REFERENCES software_architecture.subsystem(id)
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
  system_requirement_id UUID NOT NULL,
  business_requirement_id UUID NOT NULL,
  CONSTRAINT requirement_implementation_pk PRIMARY KEY (system_requirement_id, business_requirement_id),
  CONSTRAINT system_requirement_fk FOREIGN KEY (system_requirement_id) REFERENCES software_architecture.system_requirement(id),
  CONSTRAINT business_requirement_fk FOREIGN KEY (business_requirement_id) REFERENCES software_architecture.business_requirement(id)
);
