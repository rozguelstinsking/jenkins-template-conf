void call(){
    println "maven: change into library made by rozg"
    node("master"){
        sh("mvn test")
    }
    
}
