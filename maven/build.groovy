void call(){
    println "maven: build()"
    node("master"){
        sh("mvn clean package")
    }
}
void call(String jparam){
    println "maven: build() ${jparam}"
}
