void call(){

   node{

	stages:{

		stage("deploy"){
			sh '''puppet agent --test --certname /cert.pem '''
			}
		}



	}

}
