<template>
    <div>
      <h2>Danh Sách Thuê Trọ</h2>
      <table>
        <thead>
          <tr>
            <th>Mã Phòng</th>
            <th>Tên Người Thuê</th>
            <th>Số Điện Thoại</th>
            <th>Ngày Bắt Đầu</th>
            <th>Hình Thức Thanh Toán</th>
            <th>Thao Tác</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="rental in rentals" :key="rental.id">
            <td>{{ rental.room.roomCode }}</td>
            <td>{{ rental.tenant.fullName }}</td>
            <td>{{ rental.tenant.phone }}</td>
            <td>{{ rental.startDate }}</td>
            <td>{{ rental.paymentType.typeName }}</td>
            <td>
              <button @click="deleteRental(rental.id)">Xóa</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
  
  <script>
  import { getRentals, deleteRental } from '../api.js';
  
  export default {
    data() {
      return {
        rentals: [],
      };
    },
    mounted() {
      this.fetchRentals();
    },
    methods: {
      async fetchRentals() {
        try {
          const response = await getRentals();
          this.rentals = response.data;
        } catch (error) {
          console.error('Lỗi khi tải danh sách thuê trọ:', error);
        }
      },
      async deleteRental(id) {
        try {
          await deleteRental(id);
          this.fetchRentals(); // Tải lại danh sách sau khi xóa
        } catch (error) {
          console.error('Lỗi khi xóa thuê trọ:', error);
        }
      },
    },
  };
  </script>
  