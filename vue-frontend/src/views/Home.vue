<template>
    <div>
      <SearchForm @update-rentals="updateRentals" />
      <RentalList :rentals="rentals" />
      <AddRentalForm @added="loadRentals" />
    </div>
  </template>
  
  <script>
  import RentalList from '../components/RentalList.vue';
  import SearchForm from '../components/SearchForm.vue';
  import AddRentalForm from '../components/AddRentalForm.vue';
  
  export default {
    components: {
      RentalList,
      SearchForm,
      AddRentalForm,
    },
    data() {
      return {
        rentals: [],
      };
    },
    methods: {
      updateRentals(updatedRentals) {
        this.rentals = updatedRentals;
      },
      async loadRentals() {
        try {
          const response = await this.$axios.get('http://localhost:8080/api/rentals');
          this.rentals = response.data;
        } catch (error) {
          console.error('Lỗi khi tải danh sách thuê trọ:', error);
        }
      },
    },
    mounted() {
      this.loadRentals();
    },
  };
  </script>
  