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
    stage('CodeAnalysis') {
      steps {
        hygieiaCodeQualityPublishStep(junitFilePattern: '*Test.xml')
      }
    }
  }
  environment {
    DevUnitTest = ''
  }
}