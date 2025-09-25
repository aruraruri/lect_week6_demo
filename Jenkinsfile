pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('checkout') {
            steps {
                git branch:'master', url:'https://github.com/aruraruri/lect_week6_demo'
            }
        }
        stage('build') {
            steps {
                mvn clean install
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }



    }


}