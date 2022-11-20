# Build Stage
#FROM node:19.1-alpine AS build

#COPY package*.json /app/
#RUN npm install 

#RUN node_modules/.bin/ng build --output-path=dist --prod=true



# Run Stage
FROM nginx:1.17.1-alpine
WORKDIR /app
COPY ./ /app/
COPY default.conf /etc/nginx/conf.d/default.conf
COPY  /dist /usr/share/nginx/html