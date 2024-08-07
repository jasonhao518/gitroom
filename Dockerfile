# Use the official Node.js image.
# https://hub.docker.com/_/node
FROM node:21-alpine

# Create and change to the app directory.
WORKDIR /usr/src/app


# Copy local code to the container image.
COPY dist/apps/frontend /usr/src/app

# Install production dependencies.
RUN npm install


# Run the Next.js application.
CMD ["npx", "next", "start","-p", "4200"]

# Inform Docker that the container is listening on the specified port at runtime.
EXPOSE 4200
