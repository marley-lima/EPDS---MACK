#!/usr/bin/env groovy
pipeline {
    agent any
     tools {
            maven "Maven"
   			}
    stages {
        stage('Get code from SCM') {
            steps {
             git 'https://github.com/Ramyel/EPDS---MACK.git'
              }
        }
        stage('Sonar Scanner analysis') {
            steps {
                withSonarQubeEnv('sonarserver') {
               sh "mvn sonar:sonar \
  							-Dsonar.projectKey=caixa \
  							-Dsonar.host.url=http://10.200.144.143:9000 \
  							-Dsonar.login=9132941746045d678cd6f3162bf1d37e6dc586c9"
                }
            }
        }
        stage('Sonar results') {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
    post {
        always {
            echo('${VERSION}')

            echo 'Cleaning workspace'
            cleanWs()
        }
    }
}
