pipeline{
  agent any
    stages{
	  stage("build stage"){
	    steps{
		  git 'https://github.com/cprasenjit/JenkinsDemo.git'
		}
	  }
	  stage("test stage"){
	    steps{
		  bat label: '', script: 'echo "This is test stage"'
		}
	  }
	  stage("deploy stage"){
	    steps{
		  bat label: '', script: 'echo "This is deploy stage"'
		}
	  }
	}
}
