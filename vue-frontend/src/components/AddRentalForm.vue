<template>
    <div>
      <h2>Thêm Thuê Phòng</h2>
      <form @submit.prevent="submitForm">
        <div>
          <label for="roomCode">Mã Phòng</label>
          <input v-model="rental.roomCode" id="roomCode" required />
        </div>
        <div>
          <label for="fullName">Tên Người Thuê</label>
          <input v-model="rental.fullName" id="fullName" required />
        </div>
        <div>
          <label for="phone">Số Điện Thoại</label>
          <input v-model="rental.phone" id="phone" required />
        </div>
        <div>
          <label for="paymentType">Hình Thức Thanh Toán</label>
          <input v-model="rental.paymentType" id="paymentType" required />
        </div>
        <div>
          <label for="startDate">Ngày Bắt Đầu</label>
          <input type="date" v-model="rental.startDate" id="startDate" required />
        </div>
        <button type="submit">Thêm Mới</button>
      </form>
    </div>
  </template>
  
  <script>
  import { createRental } from '../api.js';
  
  export default {
    data() {
      return {
        rental: {
          roomCode: '',
          fullName: '',
          phone: '',
          paymentType: '',
          startDate: '',
        },
      };
    },
    methods: {
      async submitForm() {
        try {
          await createRental(this.rental);
          this.$emit('added');
          this.clearForm();
        } catch (error) {
          console.error('Lỗi khi thêm thuê phòng:', error);
        }
      },
      clearForm() {
        this.rental = {
          roomCode: '',
          fullName: '',
          phone: '',
          paymentType: '',
          startDate: '',
        };
      },
    },
  };
  </script>
  