# TeamC
This app is developed with SpringBoot. If you submit a query of landscape name, it will recommend 

We tried micro-service-architecture.

## how to use

### 1. setup
```
mkdir teamc
cd teamc
git clone https://github.com/shortintern2019/TeamC.git
```

### 2. user-api 
```
cd user-api
mvn clean package  
mvn spring-boot:run
```
Access to `localhost:8080/index`

### 3. spot-search-api
```
cd spot-search-api
mvn clean package
mvn spring-boot:run
```

### 4. spot-deatail
```
cd spot-deatail # warning
mvn clean package
mvn spring-boot:run
```

### 5. spot-api
```
cd spot-api
mvn clean package
mvn spring-boot:run
```
