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
3. Accessing the application by running the command minikube service bookstore-service http://localhost:8080/books
4. Explanation of the CI/CD pipelines:
    


