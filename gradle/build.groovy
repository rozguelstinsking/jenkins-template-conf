#!/groovy
void call(){
    print "gradle: build() without args"
    print config.message
    print config.version	
    for(int i=0;i < config.version;i++){
	print config.message + i
	}
}
void call(String arg){
    print "gradle: build(): with args: ${arg}"
}

