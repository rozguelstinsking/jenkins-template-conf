void call(){
    println "maven: change into library made by rozg"

    print $env

    node("master"){
        sh("mvn test")
    }

    
    
}
