node {
  stage ('Git Chekout') {
    git 'https://github.com/anasselbaz0/Jira-Clone'
  }
  stage ('Compile package') {
    sh 'mvn package'
  }
}
