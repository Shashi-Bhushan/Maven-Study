### MAVEN

Used for Building Project, Managing dependencies via xml configurations, Reporting, Deployment

### ESSENTIAL Elements
 
 '''
 <project>
    <modelVersion>4.0.0</modelVersion>
 	<groupId>com.maven.study</groupId>
 	<artifactId>Maven-Study</artifactId>
 	<version>0.0.1-SNAPSHOT</version>
 	</project>
 '''
 
 - Project Tag.
 - Under Project Tag, 
    Project Group (groupId)
    Project Name (artifactId)
    Project Version (version)
    
### SUPER POM

All maven project POMs extends from Maven Super POM.
you can get effective pom for the project by using '''mvn help:effective-pom'''
This will show the effective POM in console, after inheritance, interpolation, and profiles are applied.