void call(){
    print "gradle: build() without args"
    print config.message
    print config.version	
    for(def i=0, i < config.version, i++){
        println config.message
    }
}

