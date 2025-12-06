def call(String ProjectName, String ImageTag, String DocekrHubUser){
  sh "docker build -t ${DocekrHubUser}/${ProjectName}:${ImageTag} ."
}
