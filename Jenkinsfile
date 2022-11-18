pipeline {
    
    agent any

    stages {
        stage('Initial_cleanup'){
            steps {

                dir ("${WORKSPACE}"){
                    deleteDir()
                }
                
            }
        }
        stage('checkout'){
            steps {

                script {
                    sh "pwd && ls"
                    sh "git clone https://github.com/madeniji017/bankapp_project_backend.git"
                }
                
            }
        }
        stage("Build"){
            steps {
                script{
                    
                    sh "cd bankapp_project_backend"
                   
                    
                }
            }
        }
        stage("Build image"){
            steps{
                script{
                    sh "cd bankapp_project_backend && docker build -t mlarry/backend_app:1.0 ."
                    
                }
            }

        }
        stage("Push image"){
            steps{
                script{
                    sh "docker login -u ${env.user} -p ${env.passwd}"
                    sh "docker push mlarry/backend_app:1.0"
                }
            }

        }
         stage("Docker logout"){
            steps{
                script{
                    sh "docker logout"
                }
            }

        }

    }
}
