void call(){
    println "maven: change into library made by rozg"

    print ${env.JOB_NAME}

    node("master"){
        sh("mvn test")
    }

    
    
}
