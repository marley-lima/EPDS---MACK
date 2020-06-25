pipeline {
    agent any

    stages {
        stage('Getting code from SCM'){
            steps {
            git 'https://github.com/Ramyel/EPDS---MACK.git'
              echo 'Building..'
            }
        }    
        stage('Sonar Analysis'){
           	steps{
            	script{
            		withSonarQubeEnv('sonarserver'){
            			sh "mvn sonar:sonar \
  -Dsonar.projectKey=caixa \
  -Dsonar.host.url=http://10.200.144.143:9000 \
  -Dsonar.login=436911139618ed771174b024642acf329dd66109"
            			}
            		timeout(time:1, unit: 'HOURS'){
            		def qg = waitForQualityGate()
            			if (qg.status != 'OK'){
            				error "Pipeline aborted: ${qg.status}"
            				}
            			}
            		sh "mvn clean install"
           		}
           	}
        }
    }
}
