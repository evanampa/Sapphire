const menuOpenButton = document.querySelector("#menu-open-button");
const menuCloseButton = document.querySelector("#menu-close-button");
const navLinks = document.querySelectorAll(".nav-menu .nav-link");

menuOpenButton.addEventListener("click", () => {
  //Toggle menu visibility
  document.body.classList.toggle("show-mobile-menu");
});

menuCloseButton.addEventListener("click", () => menuOpenButton.click());

navLinks.forEach( link => {
  link.addEventListener("click", () => menuOpenButton.click());
});

// Using the fetch API to call an example endpoint
document.addEventListener("DOMContentLoaded", function () {
  fetch("http://localhost:8080/products")
    .then((response) => response.json())
    .then((products) => {
      const productList = document.querySelector(".product-list");

      productList.innerHTML = ""; // Καθαρίζουμε ό,τι είχε

      products.forEach((product) => {
        productList.innerHTML += `
          <li class="product-item">
            <img
              src="${product.image_url}"
              alt="${product.name}"
              class="product-image"
            />
            <h3 class="name">${product.name}</h3>
            <p class="text">${product.description}</p>
          </li>
        `;
      });
    })
    .catch((error) => {
      console.error("Error loading products:", error);
    });
});
