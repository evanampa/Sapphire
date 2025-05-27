const menuOpenButton = document.querySelector("#menu-open-button");
const menuCloseButton = document.querySelector("#menu-close-button");
const navLinks = document.querySelectorAll(".nav-menu .nav-link");

menuOpenButton.addEventListener("click", () => {
  //Toggle menu visibility
  document.body.classList.toggle("show-mobile-menu");
});

menuCloseButton.addEventListener("click", () => menuOpenButton.click());

navLinks.forEach((link) => {
  link.addEventListener("click", () => menuOpenButton.click());
});

function shuffleArray(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
  return array;
}

// Κλήση στο backend και εμφάνιση τυχαίων προϊόντων
fetch('http://localhost:8080/products')
  .then(response => response.json())
  .then(products => {
    const shuffledProducts = shuffleArray(products); 
    const container = document.querySelector('.product-list');
    container.innerHTML = ''; 

    // Only 6 elements
    const limitedProducts = shuffledProducts.slice(0, 6);

    limitedProducts.forEach(product => {
      container.innerHTML += `
        <li class="product-item">
          <img src="${product.image_url}" alt="${product.name}" class="product-image" />
          <h3 class="name">${product.name}</h3>
          <p class="text">${product.description}</p>
        </li>
      `;
    });
  })
  .catch(error => console.error('Error fetching products:', error));