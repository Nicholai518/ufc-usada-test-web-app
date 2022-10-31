import Head from 'next/head'
import Image from 'next/image'
import Form from 'react-bootstrap/Form'
import styles from '../styles/Home.module.css'

export default function Home() {
  return (
    <div className={styles.container}>
      <Head>
        <title>UFC USADA Test Results</title>
        <meta name="description" content="Landing page showing usada test results for current year" />
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <main className={styles.main}>
        <h1>UFC USADA Test Data</h1>
        <Form.Select aria-label="Default select example">
          <option value="2022">2022</option>
          <option value="2021">2021</option>
          <option value="2020">2020</option>
          <option value="2019">2019</option>
          <option value="2018">2018</option>
          <option value="2017">2017</option>
          <option value="2016">2016</option>
          <option value="2015">2015</option>
          <option value="All">All</option>
        </Form.Select>
      </main>


      {/* 2 buttons at top  */}
      {/* [Year] (Default value = current year, drop down and select different years 2015 - 2022) */}

      {/* Table for UFC USADA test data */}
      {/* Test score is decending order */}
      {/* Col 1 = Fighter name         Col 2 = Test Count         Col 3 = % (UFC Fighter test count / Total Tests) */}


      <footer className={styles.footer}>

      </footer>
    </div>
  )
}
