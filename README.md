# About Maven

Used for Building Project, Managing dependencies via xml configurations, Reporting, Deployment

## ESSENTIAL Elements
 
 These are the essential elements every POM must have.
```html
    <project>
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.maven.study</groupId>
        <artifactId>Maven-Study</artifactId>
        <version>0.0.1-SNAPSHOT</version>
 	</project>
```
 
 * Project Tag.
 * Under Project Tag, 
    - Project Group     (groupId)
    - Project Name      (artifactId)
    - Project Version   (version)
    
## POM

### Super POM
All maven project POMs extends from **Maven Super POM**.
This will be ```&lt;parent&gt;``` for every POM, unless otherwise 
you can get effective pom for the project by using ```mvn help:effective-pom```
This will show the effective POM in console, after inheritance, interpolation, and profiles are applied.

### Effective POM
