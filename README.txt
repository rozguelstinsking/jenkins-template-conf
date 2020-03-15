
Jenkinsconfig repo
=======
Repository for store template libraries

This labraries are divided into technology specific tasks tath are called from into pipeline stages.



you must to define the  jenkinsfile to insert different stages into this one.


the content of Jwnkinsfile will be e.g.


unit_test()
build("la chimbita")
static_code_analysis()
sonar_qa()
kubernetes_deploy()


Each line is the library called from JTE jenkins template engine, the Jenkins Template Engine must be pre configured. 


