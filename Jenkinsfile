pipeline {
  agent any
  stages {
    stage('buildProj') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('testRun') {
      steps {
        sh 'mvn test'
      }
    }
  }
  environment {
    DevUnitTest = ''
  }
}