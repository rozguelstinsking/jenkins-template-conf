void call(String myarg){
    print "gradle: build(): ${myarg}"
}
void call(ApplicationEnvironment env){
    print "gradle: build() AppEnv: ${env}"
}
