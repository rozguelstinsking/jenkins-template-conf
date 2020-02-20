void call(){

   node{

	stages:{

		stage("deploy"){
			sh '''echo "call puppetserver	" '''
			sh '''puppet agent --test '''
			}
		}



	}

}
