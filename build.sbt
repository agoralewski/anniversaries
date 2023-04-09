name := "anniversaries"
version := "0.1"
scalaVersion := "2.12.10"

libraryDependencies ++= Seq(


  "org.scalatest" %% "scalatest" % "3.2.15" % "test",
)


assembly / test := {}
assembly / assemblyJarName := s"${name.value}.jar"

Test / parallelExecution := false

