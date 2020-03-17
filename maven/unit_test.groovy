void call(){
    println "maven: change into library made by rozg"

    print "environment jobname: ${env.JOB_NAME}"

    print "environment actual: ${env.dev.long_name}"

    //node("master"){
        sh("mvn test")
    //}

    
    
}
