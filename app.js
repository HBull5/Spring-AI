const baseJokeUrl = 'http://localhost:8080/dad-jokes';
const baseNameUrl = 'http://localhost:8080/dad-names';
const defaultCategories = ['taxes', 'cars', 'hurricanes', 'houses'];

const getRandomDefaultCategory = () => defaultCategories[Math.floor(Math.random() * defaultCategories.length)];

window.addEventListener('load', function () {
  const submitBtn = document.querySelector('#submit-btn');
  const category = document.querySelector('#category'); 
  const jokeOutput = document.querySelector('#joke-output');
  const nameOutput = document.querySelector('#name-output');

  const fetchResults = async initialLoad => {
    const value = initialLoad ? getRandomDefaultCategory() : category?.value;
    const fetchUrl = value ? `${baseJokeUrl}?category=${value}` : baseJokeUrl;
    try {
      const jokeResponse = await fetch(fetchUrl);
      const jokeResponseText = await jokeResponse.text();
      const nameResponse = await this.fetch(baseNameUrl);
      const nameResponseText = await nameResponse.text();
      jokeOutput.innerHTML = `"${jokeResponseText}"`;          
      nameOutput.innerHTML = `<figcaption class="blockquote-footer">${nameResponseText}</figcaption>`;
    } catch (error) {
      console.error(error);
    }
  };
  
  submitBtn.addEventListener('click', async e => {
    e.preventDefault();
    fetchResults(false);
  });

  fetchResults(true);
});