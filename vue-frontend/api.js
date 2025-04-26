import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api', // URL của backend Spring Boot
});

export const getRentals = () => api.get('/rentals');
export const searchRentals = (query) => api.get(`/rentals/search?query=${query}`);
export const createRental = (rental) => api.post('/rentals', rental);
export const deleteRental = (id) => api.delete(`/rentals/${id}`);
