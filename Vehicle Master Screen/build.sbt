lazy val root = (project in file("."))
.enablePlugins(PlayJava)
.settings(
name := """Vehicle Master Screen""",
version := "1.0-SNAPSHOT",
scalaVersion := "2.13.6",
libraryDependencies ++= Seq(
guice,
// Test Database
"com.h2database" % "h2" % "1.4.199",
// Testing libraries for dealing with CompletionStage...
"org.assertj" % "assertj-core" % "3.14.0" % Test,
"org.awaitility" % "awaitility" % "4.0.1" % Test,
),
javacOptions ++= Seq(
"-encoding", "UTF-8",
"-parameters",
"-Xlint:unchecked",
"-Xlint:deprecation",
"-Werror"
),
// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
)
//libraryDependencies ++= Seq(
// "mysql" % "mysql-connector-java" % "5.1.41"
//)

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.6.0"
libraryDependencies += "org.mongodb.morphia" % "morphia" % "1.3.2"



libraryDependencies ++= Seq(
javaWs
)
libraryDependencies += ehcache
libraryDependencies += jdbc



libraryDependencies ++= Seq(
javaJdbc
)



// https://mvnrepository.com/artifact/org.json/json
libraryDependencies += "org.json" % "json" % "20210307"



// https://mvnrepository.com/artifact/com.jcraft/jsch
libraryDependencies += "com.jcraft" % "jsch" % "0.1.55"
