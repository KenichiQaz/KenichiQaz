<p align="center"><a href="https://github.com/anuraghazra/github-readme-stats">
  <img align="center" src="https://github-readme-stats.vercel.app/api?username=KenichiQaz&show_icons=true&theme=tokyonight" />
</a></p>

<p align="center"><a href="https://wakatime.com/@KenichiQ">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@KenichiQ/9fca8171-190c-4e76-8a49-838f7f0a2bbc.svg" />
</a>
<a href="https://wakatime.com/@KenichiQ">
  <img align="center" width="400" height="300" src="https://wakatime.com/share/@KenichiQ/279aa5bb-cabf-4f50-be29-b58ad93b6598.svg" />
</a></p>


### 👷 What I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}