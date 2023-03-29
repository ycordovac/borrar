apiVersion: v1
kind: Pod
spec:
  securityContext:
    runAsUser: 1001
  containers:
    - name: aks
      image: ${imageName}.azurecr.io/ndop_aks_builder:latest
      command:
        - sleep
      args:
        - infinity
  imagePullSecrets:
    - name: $credentialSecret