@echo off
set repo=%HOMEDRIVE%%HOMEPATH%\.m2\repository\
set version=1.0.0-M6
set folder=%repo%org\junit\platform\junit-platform-console-standalone\%version%\
set jarname=%folder%junit-platform-console-standalone-%version%.jar
echo on
java -jar %jarname% --cp ..\lib\jbehave-core-4.1.1.jar;..\lib\spring-test-4.3.7.RELEASE.jar;..\lib\commons-logging-1.2.jar;..\lib\spring-beans-4.3.7.RELEASE.jar;..\lib\spring-core-4.3.7.RELEASE.jar;..\lib\spring-context-4.3.7.RELEASE.jar;target\example-jbehave-tests-1.0-SNAPSHOT.jar -p example -n ^.*Story?$ -n ^.*Test?$
