# Java-SQL

## Information
Contains courses on Object Relational Mapping between Java & SQL, using respectively JDBC, JPA and Hibernate, in order to understands the underlying processes in Hibernate.

- **1.JDBC_JPA**: Demonstrations & Exercises about JDBC & JPA.  
**JDBC** demo1 is about introducing connection between sql & java & demo2 is about reorganizing a jdbc project into different subfolders (Dao, Model, Service, Util) for practical use.
**JPA** demos are about managing Entity, Heritage and relation (Embedded, ManyToMany, OneToMany & OneToOne) with it.

All demos & exercises should have been done on a different project, since the same persistence.xml file is used, we end up creating empty tables of others demos/exercises in databases. It was kept this way for "simplicity" purpose.


- **2.Hibernate**: Demonstration & Exercise on hibernate. In practice, it works very similarily to JPA, except that instead of working around a persistence file we have a hibernate.iml, hibernate.cfg.xml & hibernate.properties file. 
It also have to be noted that each demonstration and each exercises should have been done on a different project each as well, as it has the same problem with JDBC/JPA in which empty tables are created. Also, in order to work on a certain sql database, mapping class in hibernate.cfg.xml & hibernate.connection.url has to be changed whenever we want to go from the demo/exercises to the other ones.
