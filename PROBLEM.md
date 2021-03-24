## Exercise: Deploy a Spring Boot microservice that uses API gateway on K8s cluster in Azure AKS.

  * In this exercise, you will deploy Spring Boot microservice that uses API gateway on K8s cluster in Azure AKS. Here Netflix Zuul is used as an API Gateway.

This exercise contains following folders:

	- k8s - A folder that contains manifest files
	- ApiGatewayService - This acts as an API Gateway
	- SbServiceOne - This is a Spring Boot application
	- SbServiceTwo - This is a Spring Boot application

This exercise contains following files in k8s folder:  

	- configmap.yml - This is to create ConfigMap.
	- apigateway.yml - This is to create a service of type LoadBalancer for ApiGateway.
	- sbserviceone.yml - This is to create a service of type LoadBalancer for SbServiceOnce.
	- sbservicetwo.yml - This is to create a service of type LoadBalancer for SbServiceTwo.


**Note**: You need to go through the comments thoroughly and complete the exercise.
Understand and perform following steps to complete this exercise:

    1. Verify that the AKS cluster is created and is ready.
    2. Push SbServiceOne image to Docker Hub.
    3. Push SbServiceTwo image to Docker Hub.
    4. Define `sbserviceone.yml` to create a service of type LoadBalancer for SbSereviceOne.
    5. Define `sbservicetwo.yml` to create a service of type LoadBalancer for SbServiceTwo.
    6. Define `configmap.yml` to create a ConfigMap.
    7. Modify the properties in `application.yml` of `ApiGatewayService` to define routes.
    8. Build and push the ApiGatewayService image to Docker Hub.
    9. Define `apigateway.yml` file to create a Service of type LoadBalancer for ApiGatewayService.
    10. Open the browser and test the APIs i.e http://<external-ip-of-ApiGatway>:<port>/sbserviceone/api/v1/hello, http://<external-ip-of-ApiGatway>:<port>/sbservicetwo/api/v1/hello url.
  

### Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided code unless instructed
- Ensure your code compiles without any errors/warning/deprecations
- Follow best practices while coding
