import Vue from 'vue'
import 'api/resource'

import App from 'pages/App.vue'
import { connect } from './util/ws'
import 'vuetify/dist/vuetify.min.css'

import Vuetify from 'vuetify'

Vue.config.productionTip = false
Vue.use(Vuetify)

if (frontendData.profile) {
    connect()
}

new Vue({
    vuetify: new Vuetify(),
    el: '#app',
    render: a => a(App)
})