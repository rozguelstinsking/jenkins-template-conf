void call(){

   node{

	stages:{

		stage("deploy"){
			sh '''puppet agent --test '''
			}
		}



	}

}
