void call(){
    print "gradle: build() without args"
    print config.message
    print config.version	
}
void call(String myarg){
    print "gradle: build(): ${myarg}"
}

