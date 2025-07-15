package com.example.app;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

///  Q1: Add a maven dependency and its related repository URL.
/// Ans: Added a repository(OWASP) and a dependency(dependency-check-core)


 /// Q2: Add a new repository in the pom.xml and use its dependencies.
 /// ANS: Added a repository(lightbend) and dependency (config)


 /// Q3: Using JAR plugin, make changes in the pom.xml to make the jar executable.
 ///     Using java -jar JAR_NAME, the output should be printed as "Hello World"
 /// ANS: Added plugin(maven-jar-plugin)


 /// Q4: Differentiate between the different dependency scopes: compile,
 ///     runtime, test, provided using different dependencies being defined in your pom.xml.
 /// ANS: 1. COMPILE - Available in compile, runtime, and test
 ///      2. RUNTIME - Not needed at compile time, but needed during execution
 ///      3. TEST - Only available during testing (not included in final JAR)
 ///      4. PROVIDED - Required for compile, but provided by the container (e.g., servlet)


 /// Q5: Create a multi-module project. Run package command at the top level to make jar of every module.
 /// ANS: 1. Change <packaging>jar</packaging> → <packaging>pom</packaging>
 ///      2. Add <modules> in outer pom.xml:
 ///         <modules>
 ///            <module>child1</module>
 ///            <module>child2</module>
 ///         </modules>
 ///      3. RUN - mvn archetype:generate -DgroupId=com.example \
 ///                        -DartifactId=child1 \
 ///                        -DarchetypeArtifactId=maven-archetype-quickstart \
 ///                        -DinteractiveMode=true
 ///
 ///               mvn archetype:generate -DgroupId=com.test2 \
 ///                         -DartifactId=child2 \
 ///                          -DarchetypeArtifactId=maven-archetype-quickstart \
 ///                          -DinteractiveMode=true
 ///      4. Set parent for both modules
 ///         <parent>
 ///            <groupId>com.example</groupId>
 ///            <artifactId>multi-module-project</artifactId>
 ///            <version>1.0-SNAPSHOT</version>
 ///         </parent>
 ///      5. RUN: mvn clean package
 public class App
{
    public static void main( String[] args )
    {
        /// Q2 starts
        Config config = ConfigFactory.load(); // auto-loads application.conf
        String appName = config.getString("app.name");
        double version = config.getDouble("app.version");
        boolean debug = config.getBoolean("app.debug");
        System.out.println("App: " + appName + " v" + version + ", Debug: " + debug);
        /// Q2 Ends


    }
}
