
cd tiny-url-handle-service
./mvnw clean install
cd ..
cd tiny-url-create-service
./mvnw clean install
cd ..
cd tiny-url-statistics-service
./mvnw clean install
cd ..
docker-compose up --build
