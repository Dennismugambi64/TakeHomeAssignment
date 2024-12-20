1. Docker locally building process:
   docker build -t dennis-muriuki: 1.0 -f Dockerfile
   docker run -p 8080:8080 app:1.0

2. Deploying on minikube:
   Start Minikube with the Docker driver by (minikube start --driver=docker)
   kubectl config use-context minikube to confirm kubectl is configured to use the Minikube context
   Deploy the application to Minikube with commands:
   kubectl apply -f k8s/deployment.yaml
   kubectl apply -f k8s/service.yaml
   kubectl apply -f k8s/hpa.yaml

3. Accessing the application by running the command minikube service bookstore-service  http://192.168.49.2:30007 (192.168.49.2 is the minikube IP and 30007 is the service port)

4. Explanation of the CI/CD pipelines:
   Triggered on push to the main branch.
   Docker image is built using the Dockerfile and pushed to Docker Hub
   The Deployment resource(deployment.yml) manages the application pods in your Kubernetes cluster. It ensures that the desired number of replicas of the application are running at any given time
   The Service exposes the application to the outside world and allows communication between different components within the cluster
   The HorizontalPodAutoscaler automatically adjusts the number of pods in a deployment based on resource usage (CPU and memory in this case). It ensures that your application can scale up or down based on traffic or load.

5. Screenshots (the images are in */images directory:

![docker.PNG](..%2Fdocker.PNG)
![manifests_deploy.PNG](..%2Fmanifests_deploy.PNG)
![existence.PNG](..%2Fexistence.PNG)