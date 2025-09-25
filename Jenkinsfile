pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('checkout') {
            steps {
                git branch:'master', url:''
            }
        }
        stage('build') {
            steps {
                mvn clean install
            }
        }

    }


}