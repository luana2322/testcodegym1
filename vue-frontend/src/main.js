import { createApp } from 'vue';
import App from './App.vue';
import axios from 'axios';

const app = createApp(App);

// Cấu hình axios toàn cục
app.config.globalProperties.$axios = axios;

app.mount('#app');
