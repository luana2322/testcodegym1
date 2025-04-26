import axios from '../axios';

const getAll = () => axios.get('/rentals');
const search = (query) => axios.get(`/rentals/search?query=${query}`);
const create = (rental) => axios.post('/rentals', rental);
const remove = (id) => axios.delete(`/rentals/${id}`);

export default {
  getAll,
  search,
  create,
  remove
};
