<template>
    <div>
      <h2>Thuê phòng mới</h2>
      <form @submit.prevent="submitRental">
        <input v-model="rental.roomId" placeholder="ID phòng" required />
        <input v-model="rental.tenantId" placeholder="ID người thuê" required />
        <input v-model="rental.paymentTypeId" placeholder="ID hình thức thanh toán" required />
        <input v-model="rental.startDate" type="date" required />
        <button type="submit">Thêm</button>
      </form>
    </div>
  </template>
  
  <script>
  import rentalService from '../services/rentalService';
  
  export default {
    data() {
      return {
        rental: {
          roomId: '',
          tenantId: '',
          paymentTypeId: '',
          startDate: ''
        }
      };
    },
    methods: {
      submitRental() {
        rentalService.create(this.rental).then(() => {
          alert("Tạo mới thành công");
          this.rental = { roomId: '', tenantId: '', paymentTypeId: '', startDate: '' };
        });
      }
    }
  };
  </script>
  