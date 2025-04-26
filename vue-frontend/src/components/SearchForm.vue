<template>
    <div>
      <input v-model="query" placeholder="Tìm kiếm theo mã phòng, tên người thuê, hoặc số điện thoại" />
      <button @click="search">Tìm kiếm</button>
    </div>
  </template>
  
  <script>
  import { searchRentals } from '../api.js';
  
  export default {
    data() {
      return {
        query: '',
      };
    },
    methods: {
      async search() {
        if (!this.query) return;
        try {
          const response = await searchRentals(this.query);
          this.$emit('update-rentals', response.data);
        } catch (error) {
          console.error('Lỗi khi tìm kiếm:', error);
        }
      },
    },
  };
  </script>
  