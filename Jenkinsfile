pipeline {
    agent any
    tools {
            maven 'MAVEN_HOME'
        }
    stages {
        stage('checkout') {
            steps {
                git branch:'master', url:'https://github.com/aruraruri/lect_week6_demo'
            }
        }
        stage('build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
                    steps {
                        recordCoverage(tools: [[parser: 'JACOCO']],
                                id: 'jacoco', name: 'JaCoCo Coverage',
                                sourceCodeRetention: 'EVERY_BUILD',
                                qualityGates: [
                                        [threshold: 60.0, metric: 'LINE', baseline: 'PROJECT', unstable: true],
                                        [threshold: 60.0, metric: 'BRANCH', baseline: 'PROJECT', unstable: true]])
                    }
                }
    }


}